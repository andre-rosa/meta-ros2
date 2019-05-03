# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of different schunk components. The files in this package are parsed and used by   a variety of other components. Most users will not interact directly   with this package."
AUTHOR = "Bruno Brito <bfb@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/schunk_description"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "schunk_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_description/0.6.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fef728147b6f74e5f589513aee10d8c4"
SRC_URI[sha256sum] = "e8b387455b278c049357886b457c7016a4b79ba90cf0b83b5382813a17505d62"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_description-0.6.12-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('schunk-modular-robotics', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/schunk-modular-robotics/schunk-modular-robotics_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/schunk-modular-robotics/schunk-modular-robotics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/schunk-modular-robotics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/schunk-modular-robotics/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
