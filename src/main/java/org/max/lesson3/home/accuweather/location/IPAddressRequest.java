package org.max.lesson3.home.accuweather.location;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class IPAddressRequest {
    @JsonProperty("Version")
    public int version;
    @JsonProperty("Key")
    public String key;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("Rank")
    public int rank;
    @JsonProperty("LocalizedName")
    public String localizedName;
    @JsonProperty("EnglishName")
    public String englishName;
    @JsonProperty("PrimaryPostalCode")
    public String primaryPostalCode;
    @JsonProperty("Region")
    public Region region;
    @JsonProperty("Country")
    public Country country;
    @JsonProperty("AdministrativeArea")
    public AdministrativeArea administrativeArea;
    @JsonProperty("TimeZone")
    public TimeZone timeZone;
    @JsonProperty("GeoPosition")
    public GeoPosition geoPosition;
    @JsonProperty("IsAlias")
    public boolean isAlias;
    @JsonProperty("ParentCity")
    public ParentCity parentCity;
    @JsonProperty("SupplementalAdminAreas")
    public ArrayList<SupplementalAdminArea> supplementalAdminAreas;
    @JsonProperty("DataSets")
    public ArrayList<String> dataSets;
}
