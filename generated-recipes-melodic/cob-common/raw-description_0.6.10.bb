# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of the Care-O-bot robot. The files in this package are parsed and used by   a variety of other components. Most users will not interact directly   with this package."
AUTHOR = "Jannik Abbenseth <jba@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_description"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "raw_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-description \
    gazebo-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/raw_description/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d3e37df8b2e1c7a3d09cbb71be4188cb"
SRC_URI[sha256sum] = "6e238ded8f4fde81b5e6244573d2b29fe9523662f034833d4c8d8252f6ecaf1e"
S = "${WORKDIR}/cob_common-release-release-melodic-raw_description-0.6.10-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('cob-common', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/cob-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/cob-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cob-common/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
