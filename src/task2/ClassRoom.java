package task2;

public class ClassRoom {
    Pupil[] pupils = new Pupil[4];
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;

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
