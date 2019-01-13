package com.baeldung.um.util;

public final class UmMappings {

    public static final class Plural {
        public static final String USERS = "users";
        public static final String PRIVILEGES = "privileges";
        public static final String ROLES = "roles";
    }

    public static final class Singular {
        public static final String USER = "user";
        public static final String PRIVILEGE = "privilege";
        public static final String ROLE = "role";
    }

    public static final class Hateoas {
        private static final String HATEOAS = "/hateoas/";

        public static final String USER = HATEOAS + Plural.USERS;
        public static final String PRIVILEGE = HATEOAS + Plural.PRIVILEGES;
        public static final String ROLES = HATEOAS + Plural.ROLES;
    }

    public static final String AUTHENTICATION = "authentication";

    private UmMappings() {
        throw new AssertionError();
    }

    // API

}
