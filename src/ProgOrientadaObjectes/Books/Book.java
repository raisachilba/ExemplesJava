package ProgOrientadaObjectes.Books;

public class Book {

    public enum Genere {NOVELA, POESIA, ECONOMIA};

    private String titol;
    private String autor;
    private String isbn;
    private Genere genere;
    private int numPagines;

    public Book(String titol, String autor, String isbn){
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genere = Genere.NOVELA;
        this.numPagines = 0;
    }

    public Book(String titol, String autor, String isbn, Genere genere, int numPagines){
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genere = genere;
        this.numPagines = numPagines;
    }

    //Getters

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Genere getGenere() {
        return genere;
    }

    public int getNumPagines() {
        return numPagines;
    }

    //Setters

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }

    public String toString(){
        return titol;
    }

    public boolean equals(Object o){
            return true;
    }
}
