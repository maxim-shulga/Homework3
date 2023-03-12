package task2;

public class Main {
    public static void main(String[] args) {
        BadPupil badpupil = new BadPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();
        GoodPupil goodPupil1 = new GoodPupil();
        GoodPupil goodPupil2 = new GoodPupil();

        ClassRoom classRoom = new ClassRoom(
                badpupil,
                excelentPupil,
                goodPupil1,
                goodPupil2
        );
        classRoom.showPupils();
    }
}
