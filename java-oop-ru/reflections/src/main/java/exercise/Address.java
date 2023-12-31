package exercise;

class Address {
    // BEGIN
    @NotNull
    @MinLength(minLength = 4)
    private String country;

    // BEGIN
    @NotNull
    @MinLength
    private String city;

    // BEGIN
    @NotNull
    private String street;

    // BEGIN
    @NotNull
    private String houseNumber;

    private String flatNumber;

    Address(String country, String city, String street, String houseNumber, String flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}
