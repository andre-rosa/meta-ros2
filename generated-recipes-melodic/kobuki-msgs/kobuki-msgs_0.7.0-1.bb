# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "<p>       Kobuki message and service types: custom messages and services for Kobuki packages.     </p>"
AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
ROS_AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_msgs"
ROS_BPN = "kobuki_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_msgs-release/archive/release/melodic/kobuki_msgs/0.7.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "583cd8f46d4af7f08319446fd4c7af05"
SRC_URI[sha256sum] = "11990d638a2cea62be1b3f6a33e17a6ac080ec52eda926bb69c173d7c14166ee"
S = "${WORKDIR}/kobuki_msgs-release-release-melodic-kobuki_msgs-0.7.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('kobuki-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('kobuki-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-msgs/kobuki-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-msgs/kobuki-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
