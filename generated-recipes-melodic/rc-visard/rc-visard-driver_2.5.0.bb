# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The rc_visard_driver provides data from a Roboception rc_visard 3D sensor on several ROS topics."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "http://wiki.ros.org/rc_visard_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_visard"
ROS_BPN = "rc_visard_driver"

ROS_BUILD_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    message-generation \
    nav-msgs \
    nodelet \
    protobuf \
    rc-dynamics-api \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    std-srvs \
    stereo-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    nav-msgs \
    nodelet \
    rc-dynamics-api \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    std-srvs \
    stereo-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    message-runtime \
    nav-msgs \
    nodelet \
    rc-dynamics-api \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    std-srvs \
    stereo-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_driver/2.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3364f97b7be76934cca7daa660a6b19c"
SRC_URI[sha256sum] = "c22eca62d0d777efcc0589eb80b8f1a5a6b4ee31964696c6e4cd22b5d67d77d9"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard_driver-2.5.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rc-visard', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rc-visard', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rc-visard/rc-visard_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rc-visard/rc-visard-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rc-visard/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rc-visard/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
