package undercast.webParser.data;

/**
 * Created by JUN on 2016-03-19.
 */
public class OvercastStat {
    private OvercastAbout about;
    private OvercastTrophy trophy;
    private OvercastStat stat;
    private OvercastEncounter encounter;
    private OvercastObjective objective;
    private OvercastRankedMatch rankedMatch;
    private OvercastInfraction infraction;

    public OvercastStat(OvercastAbout about, OvercastTrophy trophy, OvercastStat stat, OvercastEncounter encounter, OvercastObjective objective, OvercastRankedMatch rankedMatch, OvercastInfraction infraction) {
        this.about = about;
        this.trophy = trophy;
        this.stat = stat;
        this.encounter = encounter;
        this.objective = objective;
        this.rankedMatch = rankedMatch;
        this.infraction = infraction;
    }

    public OvercastAbout getAbout() {
        return about;
    }

    public OvercastTrophy getTrophy() {
        return trophy;
    }

    public OvercastEncounter getEncounter() {
        return encounter;
    }

    public OvercastObjective getObjective() {
        return objective;
    }

    public OvercastInfraction getInfraction() {
        return infraction;
    }

    public OvercastStat getStat() {
        return stat;
    }

    public OvercastRankedMatch getRankedMatch() {
        return rankedMatch;
    }
}
