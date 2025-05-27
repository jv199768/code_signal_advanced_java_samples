import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static List<String> analyzeLogs(String logs) {
        List<String> logList = new ArrayList<>(Arrays.asList(logs.split(", ")));

        HashMap<Integer, int[]> timeDict = new HashMap<>();  // HashMap to record the creation moment for each group in minutes
        TreeMap<Integer, Integer> lifeDict = new TreeMap<>(); // TreeMap to record the lifetime for each group in minutes

        for (String log : logList) {
            String[] parts = log.split(" ");
            int groupId = Integer.parseInt(parts[0]);
            String action = parts[1];
            String time = parts[2];

            // Parsing the time from HH:MM format
            int hour = Integer.parseInt(time.substring(0, 2));
            int minute = Integer.parseInt(time.substring(3, 5));
            int currentTime = hour * 60 + minute; // Time in minutes from start of day

            if (action.equals("create")) {
                timeDict.put(groupId, new int[]{hour, minute}); // If the group is created, log the creation time.
            } else {
                if (timeDict.containsKey(groupId)) {
                    // If the group is deleted, calculate its entire lifetime and remove it from the records.
                    int creationTime = timeDict.get(groupId)[0] * 60 + timeDict.get(groupId)[1];
                    int lifetime = currentTime - creationTime;
                    lifeDict.put(groupId, lifeDict.getOrDefault(groupId, 0) + lifetime);
                    timeDict.remove(groupId);
                }
            }
        }
