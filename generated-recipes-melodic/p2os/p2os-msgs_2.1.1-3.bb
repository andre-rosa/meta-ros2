# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Defines the messages that are used to communicate with the     p2os_driver package and the ROS infrastructure."
AUTHOR = "Hunter L. Allen <hunter@openrobotics.org>"
ROS_AUTHOR = "Hunter L. Allen <hunter@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/p2os-purdue"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "p2os"
ROS_BPN = "p2os_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-generation \
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

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_msgs/2.1.1-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fd4e28a2d4fdff114da379fee685305f"
SRC_URI[sha256sum] = "03bd75df3567d74a4b0e3357d73ae5cf4085fc772aa1c65e36078f4afb566b9f"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_msgs-2.1.1-3"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('p2os', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('p2os', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/p2os/p2os_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/p2os/p2os-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/p2os/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/p2os/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
