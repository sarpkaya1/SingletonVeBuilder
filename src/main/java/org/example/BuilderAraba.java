package org.example;
import lombok.Builder;
import lombok.ToString;

@ToString
public class BuilderAraba {
    private String marka;
    private String model;
    private String vitesTipi;
    private int fiyat;


    public static final class BuilderArabaBuilder {
        private String marka;
        private String model;
        private String vitesTipi;
        private int fiyat;

        private BuilderArabaBuilder() {
        }

        public static BuilderArabaBuilder aBuilderAraba() {
            return new BuilderArabaBuilder();
        }

        public BuilderArabaBuilder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public BuilderArabaBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public BuilderArabaBuilder withVitesTipi(String vitesTipi) {
            this.vitesTipi = vitesTipi;
            return this;
        }

        public BuilderArabaBuilder withFiyat(int fiyat) {
            this.fiyat = fiyat;
            return this;
        }

        public BuilderAraba build() {
            BuilderAraba builderAraba = new BuilderAraba();
            builderAraba.model = this.model;
            builderAraba.fiyat = this.fiyat;
            builderAraba.marka = this.marka;
            builderAraba.vitesTipi = this.vitesTipi;
            return builderAraba;
        }
    }
}
