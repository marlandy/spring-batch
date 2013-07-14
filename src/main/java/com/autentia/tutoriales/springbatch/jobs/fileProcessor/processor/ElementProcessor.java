package com.autentia.tutoriales.springbatch.jobs.fileProcessor.processor;

import com.autentia.tutoriales.springbatch.jobs.fileProcessor.model.AnotherElement;
import com.autentia.tutoriales.springbatch.jobs.fileProcessor.model.Element;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class ElementProcessor implements ItemProcessor<Element, AnotherElement> {

    @Override
    public AnotherElement process(Element element) throws Exception {
        final String anotherElementId = element.getId() + "::" + element.getText();
        return new AnotherElement(anotherElementId);
    }
}
