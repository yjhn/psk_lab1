package lab1.mybatis.model;

import java.util.Set;

public class StoreNetwork {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STORE_NETWORK.ID
     *
     * @mbg.generated Fri Mar 04 14:14:56 EET 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STORE_NETWORK.NAME
     *
     * @mbg.generated Fri Mar 04 14:14:56 EET 2022
     */
    private String name;

    private Set<City> citiesWithStores;

    public Set<City> getCitiesWithStores() {
        return citiesWithStores;
    }

    public void setCitiesWithStores(Set<City> cities) {
        this.citiesWithStores = cities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STORE_NETWORK.ID
     *
     * @return the value of PUBLIC.STORE_NETWORK.ID
     *
     * @mbg.generated Fri Mar 04 14:14:56 EET 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STORE_NETWORK.ID
     *
     * @param id the value for PUBLIC.STORE_NETWORK.ID
     *
     * @mbg.generated Fri Mar 04 14:14:56 EET 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STORE_NETWORK.NAME
     *
     * @return the value of PUBLIC.STORE_NETWORK.NAME
     *
     * @mbg.generated Fri Mar 04 14:14:56 EET 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STORE_NETWORK.NAME
     *
     * @param name the value for PUBLIC.STORE_NETWORK.NAME
     *
     * @mbg.generated Fri Mar 04 14:14:56 EET 2022
     */
    public void setName(String name) {
        this.name = name;
    }
}