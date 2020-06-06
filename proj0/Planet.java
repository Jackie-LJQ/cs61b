public class Planet
{
  static final double G = 6.67e-11;
  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;
  public Planet(double xP, double yP, double xV,double yV, double m, String img)
  {
    this.xxPos=xP;
    this.yyPos=yP;
    this.xxVel=xV;
    this.yyVel=yV;
    this.mass=m;
    this.imgFileName=img;
  }

  public Planet(Planet p)
  {
    this.xxPos=p.xxPos;
    this.yyPos=p.yyPos;
    this.xxVel=p.xxVel;
    this.yyVel=p.yyVel;
    this.mass=p.mass;
    this.imgFileName=p.imgFileName;
  }

  public double calcDistance(Planet p)
  {
    double temp = Math.pow(this.xxPos-p.xxPos,2)+Math.pow(this.yyPos-p.yyPos, 2);
    return Math.sqrt(temp);
  }

  public double calcForceExertedBy(Planet p)
  {
    double dist = this.calcDistance(p);
    return this.mass*p.mass*G/Math.pow(dist,2);
  }

  public double calcForceExertedByX(Planet p)
  {
    double dist = this.calcDistance(p);
    double xdist = p.xxPos-this.xxPos;
    return this.calcForceExertedBy(p)*xdist/dist;
  }

  public double calcForceExertedByY(Planet p)
  {
    double dist = this.calcDistance(p);
    double ydist = p.yyPos-this.yyPos;
    return this.calcForceExertedBy(p)*ydist/dist;
  }

  public double calcNetForceExertedByX(Planet[] allplanet)
  {
    double fx = 0;
    for (Planet p:allplanet){
      if (this.equals(p)){continue;}
      fx = fx+this.calcForceExertedByX(p);
    }
    return fx;
  }


  public double calcNetForceExertedByY(Planet[] allplanet)
  {
    double fy = 0;
    for (Planet p:allplanet){
      if (this.equals(p)){continue;}
      fy = fy+this.calcForceExertedByY(p);
    }
    return fy;
  }

  public void update(double dt, double fx, double fy)
  {
    this.xxVel = this.xxVel+fx/this.mass*dt;
    this.yyVel = this.yyVel+fy/this.mass*dt;
    this.xxPos = this.xxPos+this.xxVel*dt;
    this.yyPos = this.yyPos+this.yyVel*dt;
  }

  public void draw()
  {
    StdDraw.picture(xxPos, yyPos, imgFileName);
    // StdDraw.show();
    // StdDraw.pause(10);
  }

}
