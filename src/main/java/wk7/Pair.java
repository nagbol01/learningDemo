package wk7;

public class Pair<T1, T2> {

  private T1 cap;
  private T2 noCap;


  public Pair(T1 cap, T2 noCap) {
    this.cap = cap;
    this.noCap = noCap;
  }

  public Pair(Pair<T1, T2> input) {
    this(input.getCap(), input.getNoCap());
  }

  public T1 getCap() {
    return this.cap;
  }

  public T2 getNoCap() {
    return this.noCap;
  }

  public Pair<T2, T1> swap(){
    return new Pair<T2,T1>(this.getNoCap(),this.getCap());
  }


}