#!/bin/bash

ssh haschemi@metrikforge.informatik.hu-berlin.de mkdir -p /var/update-sites/EMFBuilderGenerator/releases
ssh haschemi@metrikforge.informatik.hu-berlin.de rm -rf /var/update-sites/EMFBuilderGenerator/releases/*
scp -r org.haschemi.utils.emfbuildergen.updatesite/target/site/* haschemi@metrikforge.informatik.hu-berlin.de:/var/update-sites/EMFBuilderGenerator/releases
scp org.haschemi.utils.emfbuildergen.updatesite/target/site_assembly.zip haschemi@metrikforge.informatik.hu-berlin.de:/var/update-sites/EMFBuilderGenerator/releases/site.zip
ssh haschemi@metrikforge.informatik.hu-berlin.de chmod -R 755 /var/update-sites/EMFBuilderGenerator
