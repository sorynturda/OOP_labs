interface Vizonare {
    public abstract void watchFilm(Film film) throws FilmIndisponibilException;
    public abstract void addToWishList(Film film) throws PremiumNotEnabledException;
    public abstract void showWishList();
    public abstract void showAlreadyWatchedList();
}
