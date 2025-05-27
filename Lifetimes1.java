import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static List<String> analyzeLogs(String logs) {
        List<String> logList = new ArrayList<>(Arrays.asList(logs.split(", ")));
