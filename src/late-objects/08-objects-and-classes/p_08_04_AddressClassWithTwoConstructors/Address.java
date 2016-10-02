package p_08_04_AddressClassWithTwoConstructors;

/**
 * Implement a class {@code Address}. An address has a house number, a
 * street, an optional apartment number, a city, a state, and a postal code.
 * Supply two constructors: one with an apartment number and one without.
 * Supply a print method that prints the address with the street on one line
 * and the city, state, and zip code on the next line. Supply a method
 * {@code public boolean comesBefore(Address other)} that tests whether this
 * address comes before another when the addresses are compared by postal code.
 */
public class Address
{
    private String houseNumber;
    private String streetName;
    private int apartmentNumber;
    private String city;
    private String postalCode;

    /**
     * Constructs object <strong>with</strong> apartment number.
     *
     * @param streetName      street name, String
     * @param apartmentNumber apartment number, String
     * @param city            city, String
     * @param postalCode      postal code, String
     */
    public Address(String streetName, int apartmentNumber, String city, String postalCode)
    {
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * Constructs object <strong>without</strong> apartment number.
     *
     * @param houseNumber house number, String
     * @param streetName  street name, String
     * @param city        city, String
     * @param postalCode  postal code, String
     */
    public Address(String houseNumber, String streetName, String city, String postalCode)
    {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * Prints the address with apartment number.
     *
     * @return full address with apartment number
     */
    public String printAddressWithApartment()
    {
        return "Apartment " + apartmentNumber + ", " + streetName + ",\n"
                + city + ", " + " " + postalCode;
    }

    /**
     * Prints the address with apartment number.
     *
     * @return full address with apartment number
     */
    public String printAddressWithoutApartment()
    {
        return "House " + houseNumber + ", " + streetName + ",\n"
                + city + ", " + " " + postalCode;
    }

    /**
     * Tests whether this address comes before another when the addresses are
     * compared by postal code.
     *
     * @param other other address to compare with this address
     * @return true if this address comes before other address lexicographically
     */
    public boolean comesBefore(Address other)
    {
        return this.postalCode.compareToIgnoreCase(other.postalCode) < 0;
    }

    /**
     * Gets this address postal code.
     *
     * @return post code, type of String
     */
    public String getPostalCode()
    {
        return this.postalCode;
    }
}
