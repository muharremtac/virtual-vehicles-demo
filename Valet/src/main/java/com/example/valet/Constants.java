package com.example.valet;

/**
 *
 * @author gstafford
 */
public class Constants {

    /**
     * These define the URL parameters used in the route definition strings
     * (e.g. '{userId}').
     */
    public class Url {

        //TODO: Your URL parameter names here...

        /**
         *
         */
                public static final String TRANSACTION_ID = "oid";
    }

    /**
     * These define the route names used in naming each route definitions. These
     * names are used to retrieve URL patterns within the controllers by name to
     * create links in responses.
     */
    public class Routes {

        /**
         *
         */
        public static final String SINGLE_TRANSACTION = "valet.single.route";

        /**
         *
         */
        public static final String TRANSACTION_COLLECTION = "valet.collection.route";
    }
}
