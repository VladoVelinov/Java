package OOP.abstraction.militaryelite;

import OOP.abstraction.militaryelite.enums.MissionStateEnum;

public class Mission {
    private String codeName;
    private MissionStateEnum status;

    public Mission(String codeName, String status) {
        if (status.equals(MissionStateEnum.inProgress.toString()))
            this.status = MissionStateEnum.inProgress;
        else if (status.equals(MissionStateEnum.finished.toString()))
            this.status = MissionStateEnum.finished;
        else
            throw new IllegalArgumentException();

        this.codeName = codeName;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s%n",
                codeName, status.toString());
    }
}