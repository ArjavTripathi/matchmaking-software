package Main.InitialSetup;

public class FetchStats {

    private String puuid;

    public void FetchStats(String puuid) {
        //Get most recent matchid from: /val/match/v1/matchlists/by-puuid/{puuid}
        String matid = "matchid";
        mostRecentRank(matid);
    }

    public void mostRecentRank(String id) {
        //get most recent rank from: /val/match/v1/matches/{matchId}
        id = "id";

    }

}
