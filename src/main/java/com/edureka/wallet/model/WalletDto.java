

package com.edureka.wallet.model;

import java.io.Serializable;

public class WalletDto implements Serializable {

<<<<<<< HEAD
	private static final long serialVersionUID = 4744691402722556258L;
=======
	private static final long serialVersionUID = 5744691402722556258N;
>>>>>>> withdraw

	private Float refundableCredit;

	private Float refundableDebit;

	private Float nonRefundableCredit;

	private Float nonRefundableDebit;

	public Float getRefundableCredit() {
		return refundableCredit;
	}

	public void setRefundableCredit(Float refundableCredit) {
		this.refundableCredit = refundableCredit;
	}

	public Float getRefundableDebit() {
		return refundableDebit;
	}

	public void setRefundableDebit(Float refundableDebit) {
		this.refundableDebit = refundableDebit;
	}

	public Float getNonRefundableCredit() {
		return nonRefundableCredit;
	}

	public void setNonRefundableCredit(Float nonRefundableCredit) {
		this.nonRefundableCredit = nonRefundableCredit;
	}

	public Float getNonRefundableDebit() {
		return nonRefundableDebit;
	}

	public void setNonRefundableDebit(Float nonRefundableDebit) {
		this.nonRefundableDebit = nonRefundableDebit;
	}

}
