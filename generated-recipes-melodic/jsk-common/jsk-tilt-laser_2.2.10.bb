# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The jsk_tilt_laser package"
AUTHOR = "YoheiKakiuchi <youhei@jsk.imi.i.u-tokyo.ac.jp>"
ROS_AUTHOR = "YoheiKakiuchi <youhei@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_common"
ROS_BPN = "jsk_tilt_laser"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    laser-assembler \
    laser-filters \
    sensor-msgs \
    tf \
    tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    laser-assembler \
    laser-filters \
    robot-state-publisher \
    sensor-msgs \
    tf \
    tf-conversions \
    urg-node \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    laser-assembler \
    laser-filters \
    robot-state-publisher \
    sensor-msgs \
    tf \
    tf-conversions \
    urg-node \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_tilt_laser/2.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7f5bd6782988b156b43d6bda4ed940db"
SRC_URI[sha256sum] = "900a78c35d33c6dc2e243480f4ef04df27f1a1773184bd64c16b83c313adb438"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_tilt_laser-2.2.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('jsk-common', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jsk-common', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/jsk-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/jsk-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-common/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
