# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pilz_industrial_motion package"
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/pilz_industrial_motion"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pilz-extensions \
    pilz-msgs \
    pilz-robot-programming \
    pilz-trajectory-generation \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion/0.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5189d73b7f7dc4b681b8a0f97bcfcccb"
SRC_URI[sha256sum] = "1c527e08942328ba1546b35ae73285e3043f7e483d16463e5456b71a94a40e93"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion-0.4.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pilz-industrial-motion/pilz-industrial-motion_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pilz-industrial-motion/pilz-industrial-motion_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/pilz-industrial-motion-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
