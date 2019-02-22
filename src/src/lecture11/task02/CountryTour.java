package lecture11.task02;

import java.util.List;

public class CountryTour {

    Integer findWhereToStartFrom(List<City> cities) {

        int numberOfCities = cities.size();

        for (int startingCityIndex = 0; startingCityIndex < numberOfCities; startingCityIndex++) {

            City currentCity = cities.get(startingCityIndex);
            int availableFood = currentCity.foodRechargeQuantity;

            for (int i = 1; i <= numberOfCities; i++) {
                currentCity = cities.get((startingCityIndex + i) % numberOfCities);
                int foodNeededToGetToNextCity = currentCity.daysAwayFromPreviousCity;

                availableFood -= foodNeededToGetToNextCity;

                if (availableFood < 0) {
                    break;
                }

                availableFood += currentCity.foodRechargeQuantity;
            }

            if (availableFood >= 0) {
                return startingCityIndex + 1;
            }
        }

        return null;
    }


}
