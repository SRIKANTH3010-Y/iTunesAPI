package com.example.ituneapiintegration;

import java.util.ArrayList;

public class Model {
    String ResultsCount;
    ArrayList<Results> results;

    public String getResultsCount() {
        return ResultsCount;
    }

    public void setResultsCount(String resultsCount) {
        ResultsCount = resultsCount;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        results = results;
    }

    public class Results{
        String wrapperType;
        String kind;
        String artistId;
        String collectionId;
        String trackId;
        String artistName;
        String collectionName;
        String trackName;
        String collectionCensoredName;
        String trackCensoredName;
        String artistViewUrl;
        String collectionViewUrl;
        String trackViewUrl;
        String previewUrl;
        String artworkUrl30;
        String artworkUrl60;
        String artworkUrl100;
        String collectionPrice;
        String trackPrice;
        String releaseDate;
        String collectionExplicitness;
        String trackExplicitness;
        String discCount;
        String discNumber;
        String trackCount;
        String trackNumber;
        String trackTimeMillis;
        String country;
        String currency;
        String primaryGenreName;
        String contentAdvisoryRating;
        String isStreamable;

        public String getWrapperType() {
            return wrapperType;
        }

        public String getKind() {
            return kind;
        }

        public String getArtistId() {
            return artistId;
        }

        public String getCollectionId() {
            return collectionId;
        }

        public String getTrackId() {
            return trackId;
        }

        public String getArtistName() {
            return artistName;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public String getTrackName() {
            return trackName;
        }

        public String getCollectionCensoredName() {
            return collectionCensoredName;
        }

        public String getTrackCensoredName() {
            return trackCensoredName;
        }

        public String getArtistViewUrl() {
            return artistViewUrl;
        }

        public String getCollectionViewUrl() {
            return collectionViewUrl;
        }

        public String getTrackViewUrl() {
            return trackViewUrl;
        }

        public String getPreviewUrl() {
            return previewUrl;
        }

        public String getArtworkUrl30() {
            return artworkUrl30;
        }

        public String getArtworkUrl60() {
            return artworkUrl60;
        }

        public String getArtworkUrl100() {
            return artworkUrl100;
        }

        public String getCollectionPrice() {
            return collectionPrice;
        }

        public String getTrackPrice() {
            return trackPrice;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public String getCollectionExplicitness() {
            return collectionExplicitness;
        }

        public String getTrackExplicitness() {
            return trackExplicitness;
        }

        public String getDiscCount() {
            return discCount;
        }

        public String getDiscNumber() {
            return discNumber;
        }

        public String getTrackCount() {
            return trackCount;
        }

        public String getTrackNumber() {
            return trackNumber;
        }

        public String getTrackTimeMillis() {
            return trackTimeMillis;
        }

        public String getCountry() {
            return country;
        }

        public String getCurrency() {
            return currency;
        }

        public String getPrimaryGenreName() {
            return primaryGenreName;
        }

        public String getContentAdvisoryRating() {
            return contentAdvisoryRating;
        }

        public String getIsStreamable() {
            return isStreamable;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }
        public String display(){
            return ("\nArtist Name: "+this.artistName+"\n"+"Collection Name: "+this.collectionName);
        }
    }

}
