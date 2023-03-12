package task2;

public class ClassRoom {
    Pupil[] pupils;
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        pupils = new Pupil[4];
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        pupils = new Pupil[3];
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2){
        pupils = new Pupil[2];
        pupils[0] = pupil1;
        pupils[1] = pupil2;
    }

    public void showPupils(){
        for (Pupil pupil: pupils
             ) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
        }
    }
}
