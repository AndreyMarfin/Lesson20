package pro.learnup.homework;

public class GameLogic {
    public static boolean isGreenLight = false;
    public static int maxSpeed = 2;


    public static String[] listOfSurvivors(String[] listOfPlayers) {
        int cnt = 0;
        for (String listOfPlayer : listOfPlayers) {
            String[] parts = listOfPlayer.split(" ");
            int speedOfPlayer = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                cnt++;
            } else {
                if (speedOfPlayer <= maxSpeed) {
                    if (speedOfPlayer >= 0) {
                        cnt++;
                    }
                } else {
                    continue;
                }
            }
        }

        String[] response = new String[cnt];
        int i = 0;
        for (String listOfPlayer : listOfPlayers) {
            String[] parts = listOfPlayer.split(" ");
            int speedOfPlayer = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                response[i] = parts[0];
            } else {
                if (speedOfPlayer <= maxSpeed) {
                    if (speedOfPlayer >= 0) {
                        response[i] = parts[0];
                        i++;
                    }
                } else {
                    continue;
                }
            }
        }
        return response;
    }

    public static int numbersOfDropOuts(String[] listOfPlayers) {
        int response = 0;
        for (String listOfPlayer : listOfPlayers) {
            String[] parts = listOfPlayer.split(" ");
            int speedOfPlayer = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                continue;
            } else {
                if (speedOfPlayer > maxSpeed) {
                    response++;
                } else {
                    if (speedOfPlayer < 0) {
                        response++;
                    } else {
                        continue;
                    }
                }
            }

        }
        return response;
    }

    public static int[] speedOfTheDroppedPlayers(String[] listOfPlayers) {
        int cnt = numbersOfDropOuts(listOfPlayers);
        int[] response = new int[cnt];
        int i = 0;
        for (String listOfPlayer : listOfPlayers) {
            String[] parts = listOfPlayer.split(" ");
            int speedOfPlayer = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                continue;
            } else {
                if (speedOfPlayer > maxSpeed) {
                    response[i] = speedOfPlayer;
                    i++;
                } else {
                    if (speedOfPlayer < 0) {
                        response[i] = speedOfPlayer;
                        i++;
                    }
                }
            }
        }
        return response;
    }

    public static int[] speedOfTheNonDroppedPlayers(String[] listOfPlayers) {
        int cnt = 0;
        for (String listOfPlayer : listOfPlayers) {
            String[] parts = listOfPlayer.split(" ");
            int speedOfPlayer = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                if (speedOfPlayer >= 0) {
                    cnt++;
                }
            } else {
                if (speedOfPlayer <= maxSpeed) {
                    if (speedOfPlayer >= 0) {
                        cnt++;
                    }
                } else {
                    continue;
                }
            }
        }

        int[] response = new int[cnt];
        int i = 0;
        for (String listOfPlayer : listOfPlayers) {
            String[] parts = listOfPlayer.split(" ");
            int speedOfPlayer = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                if (speedOfPlayer >= 0) {
                    response[i] = speedOfPlayer;
                    i++;
                }
            } else {
                if (speedOfPlayer <= maxSpeed) {
                    if (speedOfPlayer >= 0) {
                        response[i] = speedOfPlayer;
                        i++;
                    }
                } else {
                    continue;
                }
            }
        }
        return response;
    }
}
