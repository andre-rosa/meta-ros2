# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Helper scripts and functionality to test industrial motion generation"
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/pilz_industrial_motion"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "pilz_industrial_motion"
ROS_BPN = "pilz_industrial_motion_testutils"

ROS_BUILD_DEPENDS = " \
    eigen-conversions \
    moveit-core \
    moveit-msgs \
    pilz-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-commander \
    moveit-core \
    moveit-msgs \
    pilz-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-commander \
    moveit-core \
    moveit-msgs \
    pilz-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion_testutils/0.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9b19aa9430adab43321db5d1430337a5"
SRC_URI[sha256sum] = "8cacbe2c01a7a31208f5e212e965daf275ee72258112d6691e6206f096dedf9a"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion_testutils-0.4.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pilz-industrial-motion', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pilz-industrial-motion', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-industrial-motion/pilz-industrial-motion_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-industrial-motion/pilz-industrial-motion-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-industrial-motion/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-industrial-motion/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
