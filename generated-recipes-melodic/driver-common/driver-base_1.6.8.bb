# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A framework for writing drivers that helps with runtime reconfiguration, diagnostics and self-test.      This package is deprecated."
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://www.ros.org/wiki/driver_base"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "driver_common"
ROS_BPN = "driver_base"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    message-generation \
    roscpp \
    self-test \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    message-runtime \
    roscpp \
    self-test \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    message-runtime \
    roscpp \
    self-test \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/driver_common-release/archive/release/melodic/driver_base/1.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4cd5488a38c58ae4406fbd71fc6ca9bc"
SRC_URI[sha256sum] = "8f279b3f0297b7798e82dd8d88949507d9dfa4dc58641d6c8d7ec66f65a70c19"
S = "${WORKDIR}/driver_common-release-release-melodic-driver_base-1.6.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('driver-common', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('driver-common', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/driver-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/driver-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/driver-common/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
