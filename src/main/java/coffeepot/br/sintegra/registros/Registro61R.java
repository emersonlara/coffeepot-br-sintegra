/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "61R"),
    @Field(name = "mesAno", length = 6, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "quantidade", length = 13, padding = '0', align = Align.RIGHT, params = "scale=3"),
    @Field(name = "valorBrutoProduto", length = 16, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseDeCalculoIcms", length = 16, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "aliquotaIcms", length = 4, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "spacer", length = 54, constantValue = " ")
})
public class Registro61R {

    private Double aliquotaIcms;
    private Double valorBrutoProduto;
    private Double quantidade;
    private String mesAno;
    private String codigoProduto;
    private Double baseDeCalculoIcms;

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Double getBaseDeCalculoIcms() {
        return baseDeCalculoIcms;
    }

    public void setBaseDeCalculoIcms(Double baseDeCalculoIcms) {
        this.baseDeCalculoIcms = baseDeCalculoIcms;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorBrutoProduto() {
        return valorBrutoProduto;
    }

    public void setValorBrutoProduto(Double valorBrutoProduto) {
        this.valorBrutoProduto = valorBrutoProduto;
    }
}
