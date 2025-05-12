package org.e2immu.analyzer.aapi.archive.javax;

import org.e2immu.annotation.Commutable;
import org.e2immu.annotation.Modified;

public class JavaxSwingTable {
    public static final String PACKAGE_NAME = "javax.swing.table";

    interface TableColumn$ {
        @Commutable
        @Modified
        void setPreferredWidth(int preferredWidth);
    }
}
