package sweeper;

class Flag {
    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
    }

    public void setFlaggedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGGED);
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    public void toggleFlaggedToBox(Coord coord) {
        switch (flagMap.get(coord)) {

            case FLAGGED:
                setClosedToBox(coord);
                break;
            case CLOSED:
                setFlaggedToBox(coord);
                break;
        }
    }


}
