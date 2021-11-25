public interface State {
    /**
     * creates interface for State
     * @return
     */
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();
}