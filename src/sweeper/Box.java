package sweeper;

public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,

    OPENED,
    CLOSED,
    FLAGGED,
    BOMBED,
    NOBOMB;

    public Object image;

    int getNumber(){
        return this.ordinal();
    }

    Box getNextNumberBox() {
        return Box.values()[this.ordinal() + 1];
    }
}
