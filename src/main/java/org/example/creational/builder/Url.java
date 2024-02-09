package org.example.creational.builder;

// https://localhost
public class Url {
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    @Override
    public String toString() {
        return "Url{" +
                "protocol='" + protocol + '\'' +
                ", hostname='" + hostname + '\'' +
                ", port='" + port + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private Url url = new Url();

        public Builder protocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder hostname(String hostname) {
            url.hostname = hostname;
            return this;
        }

        public Builder port(String port) {
            url.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            url.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            url.queryParam = queryParam;
            return this;
        }

        public Url build() {
            return this.url;
        }
    }


}
