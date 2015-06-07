package org.doxer.app.db.dbflute.allcommon;

import java.util.*;

import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface CDef extends Classification {

    /** The empty array for no sisters. */
    String[] EMPTY_SISTERS = new String[]{};

    /** The empty map for no sub-items. */
    @SuppressWarnings("unchecked")
    Map<String, Object> EMPTY_SUB_ITEM_MAP = (Map<String, Object>)Collections.EMPTY_MAP;

    /**
     * フラグを示す
     */
    public enum Flag implements CDef {
        /** はい: 有効を示す */
        On("1", "はい", EMPTY_SISTERS)
        ,
        /** いいえ: 無効を示す */
        Off("0", "いいえ", EMPTY_SISTERS)
        ;
        private static final Map<String, Flag> _codeValueMap = new HashMap<String, Flag>();
        static {
            for (Flag value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private Flag(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.Flag; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flag codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Flag) { return (Flag)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Flag nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Flag> listAll() {
            return new ArrayList<Flag>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<Flag> groupOf(String groupName) {
            return new ArrayList<Flag>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * フラグを示す
     */
    public enum Mode implements CDef {
        /** 登録: 登録処理を示す */
        Register("01", "登録", EMPTY_SISTERS)
        ,
        /** 更新: 更新理を示す */
        Update("02", "更新", EMPTY_SISTERS)
        ,
        /** 削除: 削除処理を示す */
        Delete("03", "削除", EMPTY_SISTERS)
        ,
        /** 複製: 複製処理を示す */
        Replicate("04", "複製", EMPTY_SISTERS)
        ;
        private static final Map<String, Mode> _codeValueMap = new HashMap<String, Mode>();
        static {
            for (Mode value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private Mode(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.Mode; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Mode codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Mode) { return (Mode)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Mode nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Mode> listAll() {
            return new ArrayList<Mode>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<Mode> groupOf(String groupName) {
            return new ArrayList<Mode>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * 手数料区分(率、円)
     */
    public enum TesuryoKb implements CDef {
        /** Percent */
        Percent("PCT", "Percent", EMPTY_SISTERS)
        ,
        /** Fixed */
        Fixed("FIX", "Fixed", EMPTY_SISTERS)
        ;
        private static final Map<String, TesuryoKb> _codeValueMap = new HashMap<String, TesuryoKb>();
        static {
            for (TesuryoKb value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private TesuryoKb(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.TesuryoKb; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static TesuryoKb codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof TesuryoKb) { return (TesuryoKb)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static TesuryoKb nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<TesuryoKb> listAll() {
            return new ArrayList<TesuryoKb>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<TesuryoKb> groupOf(String groupName) {
            return new ArrayList<TesuryoKb>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * 連絡先用途区分(通常、緊急)
     */
    public enum RenrakusakiYotoKb implements CDef {
        /** Normal */
        Normal("NRM", "Normal", EMPTY_SISTERS)
        ,
        /** Emergency */
        Emergency("EMG", "Emergency", EMPTY_SISTERS)
        ;
        private static final Map<String, RenrakusakiYotoKb> _codeValueMap = new HashMap<String, RenrakusakiYotoKb>();
        static {
            for (RenrakusakiYotoKb value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private RenrakusakiYotoKb(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.RenrakusakiYotoKb; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static RenrakusakiYotoKb codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof RenrakusakiYotoKb) { return (RenrakusakiYotoKb)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static RenrakusakiYotoKb nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<RenrakusakiYotoKb> listAll() {
            return new ArrayList<RenrakusakiYotoKb>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<RenrakusakiYotoKb> groupOf(String groupName) {
            return new ArrayList<RenrakusakiYotoKb>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** フラグを示す */
        Flag
        ,
        /** フラグを示す */
        Mode
        ,
        /** 手数料区分(率、円) */
        TesuryoKb
        ,
        /** 連絡先用途区分(通常、緊急) */
        RenrakusakiYotoKb
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public Classification codeOf(Object code) {
            if ("Flag".equals(name())) { return CDef.Flag.codeOf(code); }
            if ("Mode".equals(name())) { return CDef.Mode.codeOf(code); }
            if ("TesuryoKb".equals(name())) { return CDef.TesuryoKb.codeOf(code); }
            if ("RenrakusakiYotoKb".equals(name())) { return CDef.RenrakusakiYotoKb.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) {
            if ("Flag".equals(name())) { return CDef.Flag.valueOf(name); }
            if ("Mode".equals(name())) { return CDef.Mode.valueOf(name); }
            if ("TesuryoKb".equals(name())) { return CDef.TesuryoKb.valueOf(name); }
            if ("RenrakusakiYotoKb".equals(name())) { return CDef.RenrakusakiYotoKb.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if ("Flag".equals(name())) { return toClassificationList(CDef.Flag.listAll()); }
            if ("Mode".equals(name())) { return toClassificationList(CDef.Mode.listAll()); }
            if ("TesuryoKb".equals(name())) { return toClassificationList(CDef.TesuryoKb.listAll()); }
            if ("RenrakusakiYotoKb".equals(name())) { return toClassificationList(CDef.RenrakusakiYotoKb.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) {
            if ("Flag".equals(name())) { return toClassificationList(CDef.Flag.groupOf(groupName)); }
            if ("Mode".equals(name())) { return toClassificationList(CDef.Mode.groupOf(groupName)); }
            if ("TesuryoKb".equals(name())) { return toClassificationList(CDef.TesuryoKb.groupOf(groupName)); }
            if ("RenrakusakiYotoKb".equals(name())) { return toClassificationList(CDef.RenrakusakiYotoKb.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClassificationList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if ("Flag".equals(name())) { return ClassificationCodeType.String; }
            if ("Mode".equals(name())) { return ClassificationCodeType.String; }
            if ("TesuryoKb".equals(name())) { return ClassificationCodeType.String; }
            if ("RenrakusakiYotoKb".equals(name())) { return ClassificationCodeType.String; }
            return ClassificationCodeType.String; // as default
        }

        public ClassificationUndefinedHandlingType undefinedHandlingType() {
            if ("Flag".equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if ("Mode".equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if ("TesuryoKb".equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if ("RenrakusakiYotoKb".equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }
    }
}
