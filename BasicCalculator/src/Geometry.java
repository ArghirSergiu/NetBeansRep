//patrat dreptunghi triunghi
public  class Geometry{
    public int perPatrat(int lat){
    return 4*lat;
     }
    public int ariaPatrat(int lat){
    return lat*lat;
    }
    public int perDreptunghi(int lat1,int lat2){
    return 2*(lat1+lat2);
    }
    public int ariaDreptunghi(int lat1,int lat2){
    return lat1*lat2;
    }
    public int perTriunghi(int lat1,int lat2,int lat3){
    return lat1+lat2+lat3;
    }
    public int ariaTriunghi(int lat,int height){
    return (lat*height)/2;
    }
}
