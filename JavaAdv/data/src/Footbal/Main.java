package Footbal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Long> players = new LinkedHashMap<>();
        Map<String, List<String>> duels = new LinkedHashMap<>();
        String regex = "([0-9]+)\\s+([a-zA-Z0-9]+)\\s*<->\\s*([a-zA-Z0-9]+)\\s+([0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        String command;
        while (!"osu!".equals(command = reader.readLine())){
            Matcher matcher = pattern.matcher(command);
            if(matcher.find()){
                Long firstPlScore = Long.parseLong(matcher.group(1));
                String firstPlName = matcher.group(2);
                String secondPlName = matcher.group(3);
                Long secondPlScore = Long.parseLong(matcher.group(4));

                players.putIfAbsent(firstPlName, 0L);
                players.putIfAbsent(secondPlName, 0L);

                Long scoreDiff = firstPlScore - secondPlScore;
                if(scoreDiff > 0){
                    players.put(firstPlName, players.get(firstPlName) + scoreDiff);
                    players.put(secondPlName,players.get(secondPlName) - scoreDiff);
                }else if(scoreDiff < 0){
                    players.put(secondPlName, players.get(secondPlName) + Math.abs(scoreDiff));
                    players.put(firstPlName, players.get(firstPlName) - Math.abs(scoreDiff));
                }
                duels.putIfAbsent(firstPlName,new ArrayList<>());
                duels.putIfAbsent(secondPlName, new ArrayList<>());
                duels.get(firstPlName).add(String.format("%s->%s", secondPlName, scoreDiff));
                duels.get(secondPlName).add(String.format("*   %s <-> %s", firstPlName, -scoreDiff));
            }
        }
        players.entrySet().stream().sorted((p1,p2)->Long.compare(p2.getValue(),p1.getValue()))
                .forEach(player->{
                    System.out.println(String.format("%s - (%s)", player.getKey(),player.getValue()));
                    for (String s : duels.get(player.getKey())) {
                        System.out.println(s);
                    }
                });
    }
}