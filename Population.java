class Population 
{
public static void main(String [] args)
{
long secondsInYear = 360*24*60*60;
long birthYear = secondsInYear/7;
long deathYear = secondsInYear/13;
long immigrantYear = secondsInYear/45;

long currentPopulation = 312032486;
long fiveYearPopulation = currentPopulation + ((birthYear - deathYear + immigrantYear)*5);
System.out.println("Current population: "+currentPopulation);
System.out.println("Five Year population: "+fiveYearPopulation);

}

}