public class EpisodSpecial extends Film{
    private int numarSezon;
    private int numarEpisod;
    public EpisodSpecial(int id, String t, String g, int d, boolean disp, int nrS, int nrE){
        super(id,t,g,d,disp);
        numarSezon = nrS;
        numarEpisod = nrE;
    }
}
