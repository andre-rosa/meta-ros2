# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The pr2_kinematics package"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_kinematics"
ROS_BPN = "pr2_kinematics"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    pr2-arm-kinematics \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pr2-arm-kinematics \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_kinematics-release/archive/release/melodic/pr2_kinematics/1.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d4c190a14493041304c932296c759a5e"
SRC_URI[sha256sum] = "a1103dc191b832b2a06bb07d9eb6d4c54a948377e0796b9d1f556e7ee3635c2c"
S = "${WORKDIR}/pr2_kinematics-release-release-melodic-pr2_kinematics-1.0.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-kinematics', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-kinematics', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/pr2-kinematics_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/pr2-kinematics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
