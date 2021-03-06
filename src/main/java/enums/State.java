package enums;

public enum State {
    ALABAMA("Alabama"),
    ALASKA("Alaska"),
    ARIZONA("Arizona"),
    ARKANSAS("Arkansas"),
    CALIFORNIA("California"),
    COLORADO("Colorado"),
    CONNECTICUT("Connecticut"),
    DELAWARE("Delaware"),
    COLUMBIA("District of Columbia"),
    FLORIDA("Florida"),
    GEORGIA("Georgia"),
    HAWAII("Hawaii"),
    IDAHO("Idaho"),
    ILLINOIS("Illinois"),
    INDIANA("Indiana"),
    KANSAS("Kansas"),
    KENTUCKY("Kentucky"),
    LOUISIANA("Louisiana"),
    MAINE("Maine"),
    MARYLAND("Maryland"),
    MASSACHUSETTS("Massachusetts"),
    MICHIGAN("Michigan"),
    MINNESOTA("Minnesota"),
    MISSISSIPPI("Mississippi"),
    MISSOURI("Missouri"),
    MONTANA("Montana"),
    NEBRASKA("Nebraska"),
    NEVADA("Nevada"),
    NEW_HAMPSHIRE("New Hampshire"),
    NEW_JERSEY("New Jersey"),
    NEW_MEXICO("New Mexico"),
    NEW_YORK("New York"),
    NORTH_CAROLINA("North Carolina"),
    NORTH_DAKOTA("North Dakota"),
    OHIO("Ohio"),
    OKLAHOMA("Oklahoma"),
    OREGON("Oregon"),
    PENNSYLVANIA("Pennsylvania"),
    PUERTO_RICO("Puerto Rico"),
    RHODE_ISLAND("Rhode Island");



    private final String value;

    State(String state) {
        this.value = state;
    }

    public String getValue() {
        return value;
    }
}
