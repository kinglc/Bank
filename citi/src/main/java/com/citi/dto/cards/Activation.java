package com.citi.dto.cards;

import java.util.List;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class Activation {
    private PropertiesBean properties;
    private List<String> required;

    public PropertiesBean getProperties() {
        return properties;
    }

    public void setProperties(PropertiesBean properties) {
        this.properties = properties;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public static class PropertiesBean {
        private CodeBean code;
        private DetailsBean details;
        private LocationBean location;
        private TypeBean type;
        private MoreInfoBean moreInfo;

        public CodeBean getCode() {
            return code;
        }

        public void setCode(CodeBean code) {
            this.code = code;
        }

        public DetailsBean getDetails() {
            return details;
        }

        public void setDetails(DetailsBean details) {
            this.details = details;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public TypeBean getType() {
            return type;
        }

        public void setType(TypeBean type) {
            this.type = type;
        }

        public MoreInfoBean getMoreInfo() {
            return moreInfo;
        }

        public void setMoreInfo(MoreInfoBean moreInfo) {
            this.moreInfo = moreInfo;
        }

        public static class CodeBean {
            private String description;
            private String type;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class DetailsBean {
            private String description;
            private String type;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class LocationBean {
            private String description;
            private String type;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class TypeBean {
            private String description;
            private String type;
            private List<String> enumX;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<String> getEnumX() {
                return enumX;
            }

            public void setEnumX(List<String> enumX) {
                this.enumX = enumX;
            }
        }

        public static class MoreInfoBean {
            private String description;
            private String type;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
