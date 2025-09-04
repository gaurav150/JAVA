import java.util.*;

public class ChallengeTaskMain {


    public static void main(String[] args) {

        Set<ChallengeTaskClass> tasks = ChallengeTaskData.getTasks("all");
        sortAndPrint("all tasks", tasks);

        Comparator<ChallengeTaskClass> sortByPriority = Comparator.comparing(ChallengeTaskClass::getPriority);
        Set<ChallengeTaskClass> annsTasks = ChallengeTaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

        Set<ChallengeTaskClass> bobsTasks = ChallengeTaskData.getTasks("Bob");
        Set<ChallengeTaskClass> carolsTasks = ChallengeTaskData.getTasks("Carol");
        List<Set<ChallengeTaskClass>> sets = List.of(annsTasks, bobsTasks, carolsTasks);

        Set<ChallengeTaskClass> assignedTasks = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTasks);

        Set<ChallengeTaskClass> everyTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("The True All Tasks", everyTask);

        Set<ChallengeTaskClass> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("Missing Tasks", missingTasks);

        Set<ChallengeTaskClass> unassignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unassignedTasks, sortByPriority);

        Set<ChallengeTaskClass> overlap = getUnion(List.of(
                getIntersect(annsTasks, bobsTasks),
                getIntersect(carolsTasks, bobsTasks),
                getIntersect(annsTasks, carolsTasks)
        ));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        List<ChallengeTaskClass> overlapping = new ArrayList<>();
        for (Set<ChallengeTaskClass> set : sets) {
            Set<ChallengeTaskClass> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }

        Comparator<ChallengeTaskClass> priorityNatural = sortByPriority.thenComparing(
                Comparator.naturalOrder());
        sortAndPrint("Overlapping", overlapping, priorityNatural);




    }

    public static void sortAndPrint(String header,
                                    Collection<ChallengeTaskClass> collection
    ) {
        sortAndPrint(header, collection, null);

    }


    public static void sortAndPrint(String header,
                                    Collection<ChallengeTaskClass> collection,
                                    Comparator<ChallengeTaskClass> sorter) {
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<ChallengeTaskClass> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);

    }

    private static Set<ChallengeTaskClass> getUnion(List<Set<ChallengeTaskClass>> sets) {

        Set<ChallengeTaskClass> union = new HashSet<>();
        for (var taskSet : sets) {
            union.addAll(taskSet);
        }
        return union;
    }

    private static Set<ChallengeTaskClass> getIntersect(Set<ChallengeTaskClass> a, Set<ChallengeTaskClass> b) {

        Set<ChallengeTaskClass> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        return intersect;
    }

    private static Set<ChallengeTaskClass> getDifference(Set<ChallengeTaskClass> a, Set<ChallengeTaskClass> b) {

        Set<ChallengeTaskClass> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

}
