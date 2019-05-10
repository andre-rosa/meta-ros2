# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Graph-based Simultaneous Localization and Mapping module.     Includes OpenKarto GraphSLAM library by &quot;SRI International&quot;."
AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
ROS_AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/robot_operator"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "navigation_2d"
ROS_BPN = "nav2d_karto"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    nav-msgs \
    nav2d-localizer \
    nav2d-msgs \
    roscpp \
    suitesparse \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    nav-msgs \
    nav2d-localizer \
    nav2d-msgs \
    roscpp \
    suitesparse \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    nav-msgs \
    nav2d-localizer \
    nav2d-msgs \
    roscpp \
    suitesparse \
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

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_karto/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3deb7d87c0748c8170b9bc1c3c6b15eb"
SRC_URI[sha256sum] = "43cc5478e64f5499139be34e4cdc8015fa3ca70d03bd49134c85b83e6934b0a2"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_karto-0.4.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation-2d', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation-2d', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-2d/navigation-2d_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-2d/navigation-2d-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-2d/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-2d/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
