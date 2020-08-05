import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
//        List<Agent> agents = new ArrayList<>();
//        première étape
////        for (String name : names ){
////            String[] test = name.split(" ");
////            agents.add(new Agent(test[0],test[1]));
////        }
//      factorisation de la première étape
//        for (String name : names ){
////            String[] test = name.split(" ");
//            agents.add(new Agent(name.split(" ")[0],name.split(" ")[1]));
//        }


        List<Agent> agents = names
                .stream()
                .map(item -> new Agent(item.split(" ")[0], item.split(" ")[1]))
                .collect(Collectors.toList());

        showAgents(agents);
    }


    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}