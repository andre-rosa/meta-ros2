# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This stack holds packages for IPA default environment configuration."
AUTHOR = "Jannik Abbenseth <jba@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_environments"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "cob_environments"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-default-env-config \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/melodic/cob_environments/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "94586aca9148304f3caaaa144ccb2828"
SRC_URI[sha256sum] = "ff50f816354b9990e71a7ed557e7c3a6df5d513cb6469a7a36367b00396f5c65"
S = "${WORKDIR}/cob_environments-release-release-melodic-cob_environments-0.6.8-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('cob-environments', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-environments/cob-environments_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-environments/cob-environments-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-environments/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-environments/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
