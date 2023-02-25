package be.technobel.ylorth.fermedelacroixblanche.validation.validators;

import be.technobel.ylorth.fermedelacroixblanche.model.form.bovins.BovinEngraissementUpdateForm;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ConfirmPoids implements ConstraintValidator<be.technobel.ylorth.fermedelacroixblanche.validation.constraints.ConfirmPoids, BovinEngraissementUpdateForm> {

    @Override
    public boolean isValid(BovinEngraissementUpdateForm value, ConstraintValidatorContext context) {
            return (value.getPoidsSurPattes()> value.getPoidsCarcasse()&&value.getPoidsCarcasse()>value.getPoidsNaissance());
    }


}
