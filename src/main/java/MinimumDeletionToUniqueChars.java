import java.util.*;
import java.util.stream.Collectors;

public class MinimumDeletionToUniqueChars {

    public static int minDeletes(String s) {
        int sumOfAllFrequencies = 0;
        int firsFrequencyNumber = 0;
        Map<Character,Integer> char_frequency = new HashMap<Character, Integer>();

        if(s.length()==0 && s.length()==1)
            return 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(char_frequency.containsKey(c)){
                char_frequency.put(c,char_frequency.get(c)+1);
            } else {
                char_frequency.put(c,1);
            }
        }

        // check if the value are distinct
        int count = (int) char_frequency.values().stream().distinct().count();
        if(count == char_frequency.size())
            return 0;
        // check if both character occur same time
        if(char_frequency.size()==2 && char_frequency.values().stream().distinct().count() ==1 ) {
            return 1;
        }

        char_frequency = char_frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        sumOfAllFrequencies= char_frequency.values().stream().mapToInt(i->i).sum();
        firsFrequencyNumber = char_frequency.entrySet().stream().findFirst().get().getValue();
        int sumOfAllElement = (firsFrequencyNumber*(firsFrequencyNumber+1))/2;

        return sumOfAllFrequencies - sumOfAllElement;
    }
}
